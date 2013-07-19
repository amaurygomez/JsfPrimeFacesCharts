
package controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Amaury
 */
@ManagedBean
@RequestScoped
public class ChartBean {

    private CartesianChartModel categoryModel;  
    private PieChartModel pieModel;  
    
  
    public ChartBean() {  
        createCategoryModel();  
        createPieModel();  
        
    }  
  
    public void itemSelect(ItemSelectEvent event) {  
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",  
                        "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
  
    
    
    public CartesianChartModel getCategoryModel() {  
        return categoryModel;  
    }  
  
    public PieChartModel getPieModel() {  
        return pieModel;  
    }  
  
    
    private void createCategoryModel() {  
        categoryModel = new CartesianChartModel();  
  
        ChartSeries zara = new ChartSeries();  
        zara.setLabel("Zara");  
  
        zara.set("2009", 80);  
        zara.set("2010", 90);  
        zara.set("2011", 100);  
        zara.set("2012", 120);  
        zara.set("2013", 150);  
  
        ChartSeries gap = new ChartSeries();  
        gap.setLabel("Gap");  
  
        gap.set("2009", 150);  
        gap.set("2010", 120);  
        gap.set("2011", 100);  
        gap.set("2012", 90);  
        gap.set("2013", 90);  
  
        categoryModel.addSeries(zara);  
        categoryModel.addSeries(gap);  
    }  
  
    
    
    
    
    
    private void createPieModel() {  
        pieModel = new PieChartModel();  
  
        pieModel.set("Zara", 700);  
        pieModel.set("tommy hilfiger", 500);  
        pieModel.set("Kenneth Cole ", 400);  
        pieModel.set("Gap", 600);  
    }  
    
    

  
}  

