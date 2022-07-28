package com.jack.diyddz;

import com.jack.diyddz.model.Player;
import com.jack.diyddz.model.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Poker poker = new Poker();
        String[] specialCard = {"X ", "D "};
        List<String> cards = poker.createCard(specialCard);
        System.out.println("--------------------Init--------------");
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i) + "  " + ((i + 1) % poker.face.length == 0 ? "\n" : ""));
        }
        System.out.println("\n");

        System.out.println("--------------------shuffle--------------");
        Collections.shuffle(cards);
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i) + "  " + ((i + 1) % poker.face.length == 0 ? "\n" : ""));
        }
        System.out.println("\n");

        System.out.println("---------------------Deal------------------");
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        ArrayList<String> landlordCards = new ArrayList<>();
        for (int i = 0; i < cards.size(); i += 3) {
            if (i >= cards.size() - 3) {
                landlordCards.add(cards.get(i));
                landlordCards.add(cards.get(i + 1));
                landlordCards.add(cards.get(i + 2));
            }
            p1.cards.add(cards.get(i));
            p2.cards.add(cards.get(i + 1));
            p3.cards.add(cards.get(i + 2));
        }

        System.out.println("P1  cards:");
        for (String card : p1.cards) {
            System.out.print(card + " ");
        }
        System.out.println("\n");
        System.out.println("P2  cards:");
        for (String card : p2.cards) {
            System.out.print(card + " ");
        }
        System.out.println("\n");
        System.out.println("P3  cards:");
        for (String card : p3.cards) {
            System.out.print(card + " ");
        }
        System.out.println("\n");
        System.out.println("landlord  cards:");
        for (String card : landlordCards) {
            System.out.print(card + " ");
        }
        System.out.println("\n");
        System.out.println("----------------------Grab----------------------");
        Scanner scanner = new Scanner(System.in);
        String landlord = scanner.nextLine();
        switch (landlord) {
            case "p1":
                p1.setLandlord(true);
                p1.cards.addAll(landlordCards);
                break;
            case "p2":
                p2.setLandlord(true);
                p2.cards.addAll(landlordCards);
                break;
            case "p3":
                p3.setLandlord(true);
                p3.cards.addAll(landlordCards);
                break;
            default:
                System.out.println("--------no landlord-----");
                break;
        }

        System.out.println("P1  cards:");
        for (String card : p1.cards) {
            System.out.print(card + " ");
        }
        System.out.println("\n");
        System.out.println("P2  cards:");
        for (String card : p2.cards) {
            System.out.print(card + " ");
        }
        System.out.println("\n");
        System.out.println("P3  cards:");
        for (String card : p3.cards) {
            System.out.print(card + " ");
        }
        System.out.println("\n");
    }
}
