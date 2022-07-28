package com.jack.diyddz.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jack
 */
public class Poker {
    /**
     * Diamond Club Spades Hearts 方块 梅花 黑桃 红桃
     */
    public String[] suit = {"D","C","S","H"};
    public String[] face = {"A","2","3","4","5","6","7","8","9","0","J","Q","K"};

    public String[] getSuit() {
        return suit;
    }

    public void setSuit(String[] suit) {
        this.suit = suit;
    }

    public String[] getFace() {
        return face;
    }

    public void setFace(String[] face) {
        this.face = face;
    }

    public List<String> createCard(String[] specialCard) {
        int suitLength = suit.length;
        int faceLength = face.length;
        int specialLength = specialCard.length;
        int baseCardLength = suitLength * faceLength;
        int length = suitLength * faceLength + specialLength;
        List<String> cards = new ArrayList<>();
        for (int i = 0; i < baseCardLength; i++) {
            cards.add(i,suit[(i / faceLength) % suitLength] + face[i % faceLength]);
        };
        cards.addAll(Arrays.asList(specialCard));
        return cards;
    }
}
