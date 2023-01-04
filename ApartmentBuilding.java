public class  ApartmentBuilding {
  
  private String address;
  private int squareFootage;
  private int numberOfApartments;
  private int numberOfFloors;
  
  public ApartmentBuilding(String address, int squareFootage, int numberOfApartments, int numberOfFloors) {
    this.address = address;
    this.squareFootage = squareFootage;
    this.numberOfApartments = numberOfApartments;
    this.numberOfFloors = numberOfFloors;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public int getSquareFootage() {
    return squareFootage;
  }
  
  public void setSquareFootage(int squareFootage) {
    this.squareFootage = squareFootage;
  }
  
  public int getNumberOfApartments() {
    return numberOfApartments;
  }
  
  public void setNumberOfApartments(int numberOfApartments) {
    this.numberOfApartments = numberOfApartments;
  }
  
  public int getNumberOfFloors() {
    return numberOfFloors;
  }
  
  public void setNumberOfFloors(int numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }
  
  @Override
  public String toString() {
    return "ApartmentBuilding [address=" + address + ",squareFootage=" + squareFootage + ",numberOfApartments=" + numberOfApartments + ",numberOfFloors=" + numberOfFloors + "]";
  }
  
}
 
    
  

   
  
