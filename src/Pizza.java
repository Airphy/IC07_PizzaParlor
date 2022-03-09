public class Pizza{
   private boolean mPepperoni, mSausage, mMushrooms, mVegan;
   private char mSize;

    public Pizza(boolean pepperoni, boolean sausage, boolean mushrooms, boolean vegan, char size) {
        this.mPepperoni = pepperoni;
        this.mSausage = sausage;
        this.mMushrooms = mushrooms;
        this.mVegan = vegan;
        this.mSize = size;
    }

    public char getSize() {
        return mSize;
    }

    public int getNumToppings() {
        int numberofToppings = 0;

        if(mPepperoni) numberofToppings +=1;
        if(mSausage) numberofToppings +=1;
        if(mMushrooms) numberofToppings +=1;
        if(mVegan) numberofToppings +=1;

        return numberofToppings;
    }

    @Override
    public String toString() {
        String output = "Pizza [" + "Size=" + mSize ;
        if(mPepperoni) output += ", Pepperoni ";
        if(mSausage) output += ", Sausage "  ;
        if(mMushrooms) output += ", Mushrooms " ;
        if(mVegan) output += ", Vegan ";
               output += ']';

        return output;
    }
}
