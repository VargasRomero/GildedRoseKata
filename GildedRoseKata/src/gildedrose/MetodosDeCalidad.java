package gildedrose;



public class MetodosDeCalidad { 
	

	
	public void AumentarCalidad1(Item item){
		item.setQuality(item.getQuality() + 1);
		}

		
		public void ReducirCalidad1(Item item){
		item.setQuality(item.getQuality() - 1);
		}

		
		public void ObtenerShellmenor1(Item item){
		item.setSellIn(item.getSellIn() - 1);
		}


		
		public void ReducirCalidadEn2(Item item){
		item.setQuality(item.getQuality() - 2);
		}

		
		public void CalidadCERO(Item item){
		item.setQuality(0);
		}}

