package pl.utp.programowanie.lab7;

import pl.utp.programowanie.lab7.Dog.DogBuilder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DogBuilder dogBuilder = DogBuilder.aDog();
        Dog pikus = dogBuilder.withName("pikuś").withAge(1).build();
        Dog azor = dogBuilder.withToys(Arrays.asList("kość", "piłka")).withName("azor").build();

        System.out.println(pikus);
        System.out.println(azor);



        // 2
        ComputerGame doom = new ComputerGame("Doom", ComputerGame.PegiAgeRating.P16, 60.0d, 2048,
                100, 8, 4, 2.4d);
        System.out.println("Name: " + doom.getTitle());
        System.out.println("TripleA: " + doom.isTripleAGame());
        System.out.println("Allowed age: " + doom.getPegiAllowedAge());
        System.out.println("Requirements: " + doom.getRequirements());

        // 3 singleton
        ZipCodeDecoderSingleton zipCodeDecoder1 = ZipCodeDecoderSingleton.getInstance();
        System.out.println(zipCodeDecoder1.decodeZipcode(87100));
        System.out.println(zipCodeDecoder1);

        ZipCodeDecoderSingleton zipCodeDecoder2 = ZipCodeDecoderSingleton.getInstance();
        System.out.println(zipCodeDecoder2);

    }
}

