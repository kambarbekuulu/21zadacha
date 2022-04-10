package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Кундорго enum тузунуз (Monday, Tuesday ...)
         * консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм"
         * же Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм"
         * деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
         * Жуманын кундорун кыргыз тилинде корсотунуз.
          */
        Scanner sca = new Scanner(System.in);
        Week week = Week.JEKSHEMBI;


	switch (week){
        case DUISHOMBU -> System.out.println("Java Technical lesson by instructor: Muxamed Alanov");
        case SHEISEMBI -> System.out.println("English lesson by english teacher:Nestenai Altynbek kyzy and " +
                "Java Practical lesson by mentor: Nurperi Arzymatova");
        case SHARSHEMBI -> System.out.println("Java Technical lessonn by instructor: Muxamed Alanov");
        case BEISHEMBI -> System.out.println("Soft Skils by teacher:Munarjan Aitbekova and" +
                " by mentor: Nurperi Arzymatova Java Practical lesson");
        case JUMA -> System.out.println("Repetion and Presentation in all tema");
        case ISHEMBI -> System.out.println("Not lesson but we ourselves repeat  the lessons and practice");
        case JEKSHEMBI -> System.out.println("day off");
        default -> System.out.println("No days with that name!");

    }





    }
}
