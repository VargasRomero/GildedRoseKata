package gildedrose;

//Tres metodos para reducir calidad
public class ReducirCalidad  {
	MetodosDecCalidad qualityMethods = new MetodosDecCalidad(); ///Instance of the class QualitySource
	
    public void ReducirCalidad(Item item) {
        if (item.getQuality() > 0) {
            if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                if (item.getName() == "Conjured Mana Cake") {
                  qualityMethods.ReducirCalidadEn2(item);
                } else {
                  qualityMethods.ReducirCalidad1(item);
                }
            }
        }
    }
    
    public void Reducir(Item item, int x) {
        if (item.getSellIn() < x) {
            CalidadMenora50(item);
        }
    }
    
    public void CalidadMenora50(Item item) {
        if (item.getQuality() < 50) {
        	qualityMethods.AumentarCalidad1(item);
        }
    }
}

