package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Raffle{

    private int[] prize;
    Random random = new Random();
    public int getLength(ArrayList<Toys> toys){
        int length = 0;
        for(Toys toy : toys){
            length+=toy.getNumber();
        }
        return length;
    }

    public int getRandomPrize(Store store){
        if(store.fullToys()){
            String message;
            System.out.println("Начало розыгрыша!");
            int prizeId;
            setPrize(store.getArray());
            prizeId = prize[randomPrize()];
            message = "Выпала игрушка с id: " + prizeId;
            Log.log(message);
            System.out.println(message);
            return prizeId;
        }else {
            return -1;
        }
    }

    public void setPrize(ArrayList<Toys> toys){
        prize = new int[getLength(toys)];
        int index = 0;
        for (Toys toy : toys){
            for(int i=0; i<toy.getNumber(); i++){
                if(toy.getNumber() > 0){
                    prize[index]=(toy.getId());
                    index++;
                }
            }
        }
        System.out.println("Список id игрушек для случайного выбора.");
        System.out.println(Arrays.toString(prize));
    }

    public int randomPrize(){
        int prizeIndex = random.nextInt(prize.length);
        return prizeIndex;
    }
}