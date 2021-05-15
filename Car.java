public class Car {
   private int modelYear; 
   // TODO: Declare purchasePrice field (int)
   private int purchasePrice;
   private int currentValue;
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   
   // TODO: Define setPurchasePrice() method
   public void setPurchasePrice(int purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   // TODO: Define getPurchasePrice() method
   public int getPurchasePrice() {
      return purchasePrice;
   }
   
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
      Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }

   public int getCurrentValue() {
      return currentValue;
   }
   
   // TODO: Define printInfo() method to output modelYear, purchasePrice, and currentValue
   /*
   Car's information:
      Model year: 2011
      Purchase price: 18000
      Current value: 5770
   */
   public void printInfo() {
      System.out.println();
      System.out.println("Car's information:");
      System.out.println("   Model year: " + getModelYear());
      System.out.println("   Purchase price: " + getPurchasePrice());
      System.out.println("   Current value: " + getCurrentValue());
   }
}