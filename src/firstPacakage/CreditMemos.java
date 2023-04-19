package firstPacakage;

public enum CreditMemos {
	
      Mastero("MASTERO"),
      
      Rupay("RUPAY"),
      
      MasterCard("MASTER_CARD");
	
	 private String cardType;
	 
	 CreditMemos(String cardType) {
		 this.cardType = cardType;
	}
      
	 public String getValue() {
		 return cardType;
	 }

}
