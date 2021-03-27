package Model;

public enum LocacaoStatus {

	RESERVADA, EFETIVADA, FINALIZADA;
	LocacaoItem locacaoItem;	
	
	 
	 public LocacaoItem getlocacaoItem() {
		 return locacaoItem;
	 }
	 public void setlocacaoItem(LocacaoItem locacaoItem) {
		 this.locacaoItem = locacaoItem;
	 }
}
