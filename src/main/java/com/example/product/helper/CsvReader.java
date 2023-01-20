package com.example.product.helper;

import com.example.product.model.Product;
import org.apache.commons.csv.*;
import org.apache.commons.csv.CSVParser;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@Service
public class CsvReader {

    public void readProductCsv(ArrayList<Product> productList) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get("/Users/ruthsan/Downloads/springDemo 2/csvfiles/products.csv"));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ){
            for (CSVRecord csvRecord : csvParser) {
                int proId = Integer.parseInt(csvRecord.get(0));
                String proName = csvRecord.get(1);
                int stock = Integer.parseInt(csvRecord.get(2));
                int price = Integer.parseInt(csvRecord.get(3));
                int gstPercentage = Integer.parseInt(csvRecord.get(4));
//                Product products = new Product(proId, proName, stock, price, gstPercentage);
//                productList.add(products);
            }}

    }

}
