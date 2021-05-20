package pl.utp.programowanie.lab7;

import pl.utp.programowanie.lab7.Dog.DogBuilder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DogBuilder dogBuilder = DogBuilder.aDog();
        Dog pikus = dogBuilder.withName("pikuś").withAge(1).withType("bulldog").build();
        Dog nerone = dogBuilder.withName("nerone").withAge(2).withToys(Arrays.asList("kość", "piłka")).build();

        System.out.println(pikus);
        System.out.println(nerone);



        // 2
        ComputerGame doom = new ComputerGame("Doom", ComputerGame.PegiAgeRating.P16, 40.0d, 2048,
                44, 4, 4, 1.8d);
        System.out.println("Name: " + doom.getTitle());
        System.out.println("TripleA: " + doom.isTripleAGame());
        System.out.println("Allowed age: " + doom.getPegiAllowedAge());
        System.out.println("Requirements: " + doom.getRequirements());

        ComputerGame doom2 = new ComputerGame("Doom2", ComputerGame.PegiAgeRating.P16, 60.0d, 2048,
                100, 8, 4, 2.4d);
        System.out.println("Name: " + doom2.getTitle());
        System.out.println("TripleA: " + doom2.isTripleAGame());
        System.out.println("Allowed age: " + doom2.getPegiAllowedAge());
        System.out.println("Requirements: " + doom2.getRequirements());

        // 3 singleton
        ZipCodeDecoderSingleton zipCodeDecoder1 = ZipCodeDecoderSingleton.getInstance();
        System.out.println(zipCodeDecoder1.decodeZipcode(61408));
        System.out.println(zipCodeDecoder1);

        ZipCodeDecoderSingleton zipCodeDecoder2 = ZipCodeDecoderSingleton.getInstance();
        System.out.println(zipCodeDecoder2);

    }
}

