package service;

import java.sql.SQLException;
import java.util.List;

import model.ProductSalesReportItem;

public interface ProductService {

    List<ProductSalesReportItem> getSalesReport() throws ClassNotFoundException, SQLException;
}