package gildedrose;
//Tres metodos de calidad
public class ReducirCalidad {
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
    
}
