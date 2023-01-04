public class Building {
    String address;
    int squareFootage;

    public Building(String address, int squareFootage) {
        this.address = address;
        this.squareFootage = squareFootage;
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
  
    public String toString() {
      return "Building[address=" + address + ",squareFootage=" + squareFootage + "]";
    }
}

  

  
