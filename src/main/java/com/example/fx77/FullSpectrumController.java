package com.example.fx77;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FullSpectrumController implements Initializable {

    @FXML
    private NumberAxis Count;

    @FXML
    private LineChart<?, ?> chart;

    @FXML
    private NumberAxis xAxis;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<Double> xCoords = new ArrayList<>();
        ArrayList<Double> yCoords = new ArrayList<>();
        ArrayList<XYChart.Series> charts = new ArrayList<>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\missi\\IdeaProjects\\nw.txt")); //"C:\\Users\\missi\\IdeaProjects\\new.txt"
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int character = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                if (!((character = br.read()) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            char ch = (char) character;
            if (character == ']') {
                break;
            }
            sb.append(ch);

        }
        String s = sb.toString().substring(1);
        int size = s.length();
        String[] s1 = s.split(",");
        for (String s2 : s1) {
            String[] temp2 = s2.split(" ");
            for (String s3 : temp2) {
                try {
                    xCoords.add(Double.parseDouble(s3));
                } catch (NumberFormatException ignored) {
                }
            }
        }
        int charactery = 0;
        StringBuilder sby = new StringBuilder();
        while (true) {
            try {
                if (!((charactery = br.read()) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            char chy = (char) charactery;
            sby.append(chy);
        }
// sby.substring(7745);
        String str = sby.toString();
        int index = str.indexOf('[');
        int index2 = str.indexOf(']');
        String temp = sby.substring(index + 1, index2);
        String[] s1y = temp.split(",");
        for (String s2y : s1y) {
            String[] temp2y = s2y.split(" ");
            for (String s3y : temp2y) {
                try {
                    yCoords.add(Double.parseDouble(s3y));
                } catch (NumberFormatException ignored) {
                }
            }


        }
        for (int j = 0; j < yCoords.size() - 1024; j++) {
            xCoords.add(xCoords.get(j));
        }
        int h =0;
        for (int c=0;c<100;c++) {
            XYChart.Series series = new XYChart.Series();
            for (int i = h; i <1024+h; i++) {
                series.getData().add(new XYChart.Data(xCoords.get(i), yCoords.get(i)));
            }
            h+=1024;
            charts.add(c, series);
            series.setName(""+(c+1));
            
        }
        chart.getData().clear();
        chart.setCreateSymbols(false);

        for (int m=0;m<100;m++) {
            chart.getData().add(charts.get(m));
        }

    }
}
