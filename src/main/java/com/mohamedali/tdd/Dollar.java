package com.mohamedali.tdd;

public class Dollar {

    private int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplied){ return new Dollar(this.amount * multiplied);
    }

    public int getAmount(){
        return amount;
    }

}
