package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int topings;
    boolean addExtraCheese;
    boolean addExtraTopings;
    boolean addbill;
    boolean takeAway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        addExtraCheese=false;
        addExtraTopings=false;
        addbill=false;
        takeAway=false;
        this.bill="";
        if(isVeg){
            this.price=300;

            this.topings=70;
        }
        else{
            this.price=400;
           // this.cheese=80;
            this.topings=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!addExtraCheese){
            price+=cheese;
            addExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        if(!addExtraTopings){
            price+=topings;
            addExtraTopings=true;
        }
    }

    public void addTakeaway(){
        if(!takeAway) {
            price += 20;
            takeAway=true;
        }
    }

    public String getBill(){
       if(!addbill) {
           if(addExtraCheese)
           this.bill+="Extra Cheese Added: "+ this.cheese+"\n";
           if(addExtraTopings)
           this.bill+="Extra Toppings Added: "+this.topings+"\n";
           if(takeAway)
           this.bill+="Paperbag Added: 20"+"\n";

           this.bill+="Total Price: "+this.price+"\n";
           addbill=true;
       }
       return this.bill;
    }
}
