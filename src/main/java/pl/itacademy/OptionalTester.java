package pl.itacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTester {

    public static void main(String[] args) throws Exception {

        Map<String, String> beerOpinions = new HashMap<>();

        beerOpinions.put("pszeniczne", "dobrze");
        beerOpinions.put("miodowe", "sridnie");
        beerOpinions.put("lagger", "zle");


        System.out.println(beerOpinions.get("lagger").length());

        //System.out.println(beerOpinions.get("ciemne").length());

        String ciemneOpinion = beerOpinions.get("ciemne");
        if( ciemneOpinion != null) {
            System.out.println(ciemneOpinion.length());
        } else {
            System.out.println("There are no opinions for ciemne beer");
        }

        Optional<String> ciemneOpinion2 =
                Optional.ofNullable(beerOpinions.get("ciemne"));

        if(ciemneOpinion2.isPresent()) {
            System.out.println(ciemneOpinion2.get().length());
        } else {
            System.out.println("There are no opinions for ciemne beer");
        }

        ciemneOpinion2.ifPresent(opinion ->
                System.out.println("IF PRESENT CALL: " + opinion.length()));

        System.out.println(
                ciemneOpinion2
                        .orElse("There are no opinions for this kind of beer"));

        String opinion = ciemneOpinion2
                .orElseThrow(() -> new Exception("No opinion exception"));


    }

}
