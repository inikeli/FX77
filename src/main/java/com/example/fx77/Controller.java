
package com.example.fx77;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import org.apache.commons.math3.linear.*;

public class Controller implements Initializable {
    ArrayList<Double> xCoords = new ArrayList<>();
    ArrayList<Double> yCoords = new ArrayList<>();
    ArrayList<XYChart.Series> charts = new ArrayList<>();
    ArrayList<Double> xCoordsRes = new ArrayList<>();
    ArrayList<Double> yCoordsRes = new ArrayList<>();
    @FXML
    private Label ENC;
    @FXML
    private Label EN;
    @FXML
    private Label from;
    @FXML
    private Label before;
    @FXML
    private Label doLanguage;
    @FXML
    private Label Label1;
    @FXML
    private Label Label2;
    @FXML
    private Label Label3;
    @FXML
    private Label Label4;
    @FXML
    private Label Label5;
    @FXML
    private Label Label6;
    @FXML
    private Label Label7;
    @FXML
    private Label Label8;
    @FXML
    private Label Label9;
    @FXML
    private Label Label10;
    @FXML
    private Label Label11;
    @FXML
    private Label Label12;
    @FXML
    private Label Label13;
    @FXML
    private Label Label14;
    @FXML
    private Label Label15;
    @FXML
    private Label Label16;
    @FXML
    private Label Label17;
    @FXML
    private Label Label18;
    @FXML
    private Label Label19;
    @FXML
    private Label Label20;
    @FXML
    private Label Label21;
    @FXML
    private Label Label22;
    @FXML
    private Label Label23;
    @FXML
    private Label Label24;
    @FXML
    private Label Label25;
    @FXML
    private Label Label26;
    @FXML
    private Label Label27;
    @FXML
    private Label Label28;
    @FXML
    private Label Label29;
    @FXML
    private Label Label30;
    @FXML
    private Label Label31;
    @FXML
    private Label Label32;
    @FXML
    private Label Label33;
    @FXML
    private Label Label34;
    @FXML
    private Label Label35;
    @FXML
    private Label Label36;
    @FXML
    private Label Label37;
    @FXML
    private Label Label38;
    @FXML
    private Label Label39;
    @FXML
    private Label Label40;
    @FXML
    private Label Label41;
    @FXML
    private Label Label42;
    @FXML
    private Label Label43;
    @FXML
    private Label Label44;
    @FXML
    private Label Label45;
    @FXML
    private Label Label46;
    @FXML
    private Label Label47;
    @FXML
    private Label Label48;
    @FXML
    private Label Label49;
    @FXML
    private Label Label50;
    @FXML
    private Label Label51;
    @FXML
    private Label Label52;
    @FXML
    private Label Label53;
    @FXML
    private Label Label54;
    @FXML
    private Label Label55;
    @FXML
    private Label Label56;
    @FXML
    private Label Label57;
    @FXML
    private Label Label58;
    @FXML
    private Label Label59;
    @FXML
    private Label Label60;
    @FXML
    private Label Label61;
    @FXML
    private Label Label62;
    @FXML
    private Label Label63;
    @FXML
    private Label Label64;
    @FXML
    private Label Label65;
    @FXML
    private Label Label66;
    @FXML
    private Label Label67;
    @FXML
    private Label Label68;
    @FXML
    private Label Label69;
    @FXML
    private Label Label70;
    @FXML
    private Label Label71;
    @FXML
    private Label Label72;
    @FXML
    private Label Label73;
    @FXML
    private Label Label74;
    @FXML
    private Label Label75;
    @FXML
    private Label Label76;
    @FXML
    private Label Label77;
    @FXML
    private Label Label78;
    @FXML
    private Label Label79;
    @FXML
    private Label Label80;
    @FXML
    private Label Label81;
    @FXML
    private Label Label82;
    @FXML
    private Label Label83;
    @FXML
    private Label Label84;
    @FXML
    private Label Label85;
    @FXML
    private Label Label86;
    @FXML
    private Label Label87;
    @FXML
    private Label Label88;
    @FXML
    private Label Label89;
    @FXML
    private Label Label90;
    @FXML
    private Label Label91;
    @FXML
    private Label Label92;
    @FXML
    private Label Label93;
    @FXML
    private Label Label94;
    @FXML
    private Label Label95;
    @FXML
    private Label Label96;
    @FXML
    private Label Label97;
    @FXML
    private Label Label98;
    @FXML
    private Label Label99;
    @FXML
    private Label Label100;

    @FXML
    private GridPane gridSpectrum;
    @FXML
    private Button card;
    @FXML
    private TextField xStart;
    @FXML
    private TextField xEnd;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private MenuItem AllCharts;
    @FXML
    private TextField numberOfChart;
    @FXML
    private MenuItem field;
    @FXML
    private MenuItem smoothing;
    @FXML
    private MenuItem buttonBL;
    @FXML
    private Button language;
    @FXML
    private LineChart<Double,Double> chart;
    @FXML
    private NumberAxis Count;
    @FXML
    private NumberAxis xAxis;
    int mi =0;
    Label[] labels1=new Label[]{Label1,Label2,Label3,Label4,Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13,Label14,Label15,Label16,Label17,Label18,Label19,Label20,
            Label21,Label22,Label23,Label24,Label25,Label26,Label27,Label28,Label29,Label30,Label31,Label32,Label33,Label34,Label35,Label36,Label37,Label38,Label39,Label40,
            Label41,Label42,Label43,Label44,Label45,Label46,Label47,Label48,Label49,Label50,Label51,Label52,Label53,Label54,Label55,Label56,Label57,Label58,Label59,Label60,
            Label61,Label62,Label63,Label64,Label65,Label66,Label67,Label68,Label69,Label70,Label71,Label72,Label73,Label74,Label75,Label76,Label77,Label78,Label79,Label80,
            Label81,Label82,Label83,Label84,Label85,Label86,Label87,Label88,Label89,Label90,
            Label91,Label92,Label93,Label94,Label95,Label96,Label97,Label98,Label99,Label100,};
    public void newMethod(){
        System.out.println("Тут создается новый файлик, удобно, стильно, молодежно");
    } public void doBorders(int start, int end){

       xAxis.setAutoRanging(false);
       xAxis.setLowerBound(start);
       xAxis.setUpperBound(end);

    }

    public void pressed(MouseEvent event1,Label label) {
        try {
            ArrayList<Double> xCoords = new ArrayList<>();
            ArrayList<Double> yCoords = new ArrayList<>();
            ArrayList<XYChart.Series> charts = new ArrayList<>();
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader("C:\\Users\\missi\\IdeaProjects\\new.txt")); //"C:\\Users\\missi\\IdeaProjects\\new.txt"
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


            int character;
            StringBuilder sb = new StringBuilder();
            while ((character = br.read()) != -1) {
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
            int charactery;
            StringBuilder sby = new StringBuilder();
            while ((charactery = br.read()) != -1) {
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
            for (int i = 0; i < yCoords.size() - 1024; i++) {
                xCoords.add(xCoords.get(i));
            }
            int m = 0;
            for (int c = 0; c < 100; c++) {
                XYChart.Series series = new XYChart.Series();
                for (int i = m; i < 1024 + m; i++) {
                    series.getData().add(new XYChart.Data(xCoords.get(i), yCoords.get(i)));
                }
                m += 1024;
            }


            ArrayList<Double> yMaxCoords = new ArrayList<>();
            double max = yCoords.get(0);
            int h = 0;
            for (int c = 0; c < 100; c++) {
                for (int i = h; i < 1024 + h; i++) {
                    if (yCoords.get(i) > max)
                        max = yCoords.get(i);

                }
                yMaxCoords.add(max);
                max = 0;
                h += 1024;
            }
            double sum = 0;
            for (int i = 0; i < yMaxCoords.size(); i++) {
                sum += yMaxCoords.get(i);
            }
            double min1 = yMaxCoords.get(0);
            double max1 = yMaxCoords.get(0);

            for (Double i : yMaxCoords) {
                if (i < min1)
                    min1 = i;
                if (i > max1)
                    max1 = i;
            }
            double average = sum / yMaxCoords.size();
            double hip = average / 8;

            Label[] labels1 = new Label[]{Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8, Label9, Label10, Label11, Label12, Label13, Label14, Label15, Label16, Label17, Label18, Label19, Label20,
                    Label21, Label22, Label23, Label24, Label25, Label26, Label27, Label28, Label29, Label30, Label31, Label32, Label33, Label34, Label35, Label36, Label37, Label38, Label39, Label40,
                    Label41, Label42, Label43, Label44, Label45, Label46, Label47, Label48, Label49, Label50, Label51, Label52, Label53, Label54, Label55, Label56, Label57, Label58, Label59, Label60,
                    Label61, Label62, Label63, Label64, Label65, Label66, Label67, Label68, Label69, Label70, Label71, Label72, Label73, Label74, Label75, Label76, Label77, Label78, Label79, Label80,
                    Label81, Label82, Label83, Label84, Label85, Label86, Label87, Label88, Label89, Label90,
                    Label91, Label92, Label93, Label94, Label95, Label96, Label97, Label98, Label99, Label100,};
            for (int i = 0; i < labels1.length; i++) {
                labels1[i].setText(yMaxCoords.get(i).toString());

            }
            for (int i = 0; i < labels1.length; i++) {
                if (labels1[i].getText().equals(label.getText())) {
                    mi = i;
                }
            }
            int hah =0;
            for (int c=0;c<100;c++) {
                XYChart.Series series = new XYChart.Series();
                for (int i = hah; i <1024+hah; i++) {
                    series.getData().add(new XYChart.Data(xCoords.get(i), yCoords.get(i)));
                }
                hah+=1024;
                charts.add(c, series);
                series.setName("График № "+(c+1));


            }

            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(charts.get(mi));

            XYChart.Series series = new XYChart.Series();
            series.getData().add(new XYChart.Data(xCoords.get(1), yMaxCoords.get(mi)));
            chart.getData().add(series);
            series.setName("Максимальное значение");

        } catch (NumberFormatException e) {
            System.out.println("Введите число");
        } catch (Exception e) {
            System.out.println(":3");
        }
    }
    int number;
    int value;
    @FXML
    private void createBaseLine(ActionEvent event) {
        try {
            ArrayList<XYChart.Series> charts = new ArrayList<>();
            number = Integer.parseInt(numberOfChart.getText());
            int L = 1024;
            int start;
            int end;
            int numGraph = number - 1;
            ArrayList<Double> ystillvalue = new ArrayList<>();
            for (int i = numGraph * 1024; i < (numGraph + 1) * 1024; i++) {
                ystillvalue.add(yCoords.get(i));
            }
            ArrayList<Double> cal;
            cal = calculate(ystillvalue, L);
            double number = 0;
            for (int i = 0; i < L; i++) {
                number = ystillvalue.get(i) - cal.get(i);
                if (number < 0) {
                    number = 0;
                    yCoordsRes.add(number);
                    xCoordsRes.add(xCoords.get(i));
                } else {
                    yCoordsRes.add(number);
                    xCoordsRes.add(xCoords.get(i));
                }
            }
            XYChart.Series series = new XYChart.Series();
            for (int i = 0; i < 1024; i++) {
                series.getData().add(new XYChart.Data(xCoordsRes.get(i), yCoordsRes.get(i)));

                charts.add(series);
                series.setName("График № " + (numGraph + 1));
            }

            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(charts.get((numGraph)));


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

        @FXML
    private void doSmoothing(ActionEvent event) {
        try {
            number=Integer.parseInt(numberOfChart.getText());
            int L = 1024;

            ArrayList<Double> ystillvalue = new ArrayList<>();
            for (int i = (number-1) * 1024; i < (number) * 1024; i++) {
                ystillvalue.add(yCoords.get(i));
            }

            double[] b = new double[L];
            for (int i = 0; i < L; i++) {
                b[i] = ystillvalue.get(i);
            }

            double[] coeffs = SGFilter.computeSGCoefficients(10,
                    4,
                    2);
            SGFilter sgFilter = new SGFilter(10, 4);

            double[] smooth = sgFilter.smooth(b,
                    coeffs);
            ArrayList<Double> yCoords1 = new ArrayList<>();
            yCoords1.add(ystillvalue.get(0));
            for (int i = 0; i <smooth.length; i++) {
                if (i==0){
                    yCoords1.add(ystillvalue.get(i));
                }
                yCoords1.add(smooth[i]);
                if (i==smooth.length){
                    yCoords1.add(ystillvalue.get(i));
                }
            }

            XYChart.Series series = new XYChart.Series();
            for (int i = 0; i <yCoords1.size(); i++) {
                series.getData().add(new XYChart.Data(xCoords.get(i), yCoords1.get(i)));
            }
            charts.add(series);
            series.setName("График № "+(number));
            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(series);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void viewSpectr(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fullSpectrum.fxml"));
            Parent root4 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root4));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void chooseNumberOfChart(ActionEvent event) {
        try {
            number=Integer.parseInt(numberOfChart.getText());
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
                series.setName("График № "+(c+1));
            }

            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(charts.get(number-1));

//            int start=0;
//            int end=0;
            int start = Integer.parseInt(xStart.getText());
            int end = Integer.parseInt(xEnd.getText());
                if(start!=0&&end!=0) {
                xAxis.setAutoRanging(false);
                xAxis.setLowerBound(start);
                xAxis.setUpperBound(end);
            }else {
                xAxis.setAutoRanging(true);

            }

        }
        catch (NumberFormatException e){
            System.out.println("Введите число");
        }
        catch (Exception e) {
            System.out.println(":3");
        }
    }
    @FXML
    private void chooseField(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("field.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root2));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Double> calculate(ArrayList<Double> b1, int L) {
        double[][] matrixA = new double[L][L];
        double[][] matrixB1 = new double[matrixA.length - 1][L];
        double[][] matrixB = new double[matrixA.length - 2][L];
        double[][] matrixC1 = new double[matrixA.length - 1][L];
        double[][] matrixC = new double[matrixA.length - 2][L];
        double[][] matrixD2 = new double[L - 1][L];
        double[][] matrixD = new double[L - 2][L];
        double[][] TmatrixD = new double[matrixD[0].length][matrixD.length];
        double[] onematrix = new double[L];
        double[][] onediag = new double[L][L];
        double[] result = new double[L];
        ArrayList<Double> resultL = new ArrayList<>();
        double[] b = new double[L];
        for (int i = 0; i < L; i++) {
            b[i] = b1.get(i);
        }

        //FULL0or1
        // эта штука делает матрицу L на L  единичками по диагонали
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < L; j++) {
                if (i != j) {
                    matrixA[i][j] = 0;
                }
                if (i == j) {
                    matrixA[i][j] = 1;
                }
            }
        }

        //MASSIVEDONTFRST
        // тут из этой матрицы удаляется первая строка
        for (int i = 0; i < matrixA.length; i++) {
            if (i != 0) {
                for (int j = 0; j < matrixA.length; j++) {
                    matrixB1[i - 1][j] = matrixA[i][j];
                }
            } else {
            }
        }

        //MASSIVEDONTLST
        // тут удаляется последняя, все это по факту сейчас только подготовка к обработке,
        // необходимо создать разряженную матрицу
        for (int i = 0; i < matrixA.length - 1; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixC1[i][j] = matrixA[i][j];
            }
        }

        //MATRIXSUBSTRUCT
        // cейчас мы вычитаем из матрицы без первой строки матрицу без второй строки,
        // так единички и нолики распределются необходимым нам образом
        for (int i = 0; i < matrixB1.length; i++) {
            for (int j = 0; j < matrixB1[0].length; j++) {
                matrixD2[i][j] = matrixB1[i][j] - matrixC1[i][j];
            }
        }
        matrixA = matrixD2;

        //MASSIVEDONTFRST2
        //Еще раз убираем первую строку, нужно еще раз их перемешать
        for (int i = 0; i < matrixA.length; i++) {
            if (i != 0) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixB[i - 1][j] = matrixA[i][j];
                }
            } else {
            }
        }

        //MASSIVEDONTLST2
        //нужно снова убрать последнюю
        for (int i = 0; i < matrixA.length - 1; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixC[i][j] = matrixA[i][j];
            }
        }

        //MATRIXSUBSTRUCT2
        //снова вычитаем
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                matrixD[i][j] = matrixB[i][j] - matrixC[i][j];
            }
        }

        //TRANSPORT
        //Теперь транспонируем ее, что бы потом умножить на не транспонированную по приколу
        for (int i = 0; i < matrixD.length; i++) {
            for (int j = 0; j < matrixD[0].length; j++) {
                TmatrixD[j][i] = matrixD[i][j];
            }
        }
        //ONEMASSIVEGLIN
        //создаем массив из единичек, потом необходимо будет перезаписывать сюда цифры в цикле и использовать,
        // каждый проход цикла сюда перезаписываются штуки, это будет умножаться на наш массив и ему будет круто
        for (int i = 0; i < onematrix.length; i++) {
            onematrix[i] = 1;
        }

        //Необходимое нам количество итераций 10, такое же значение было и в питоне
        for (int PIIBHILISM = 0; PIIBHILISM < 10; PIIBHILISM++) {
            int k = 0;

            //Наш массив, который из единичек и куда будут записывать значения по прохождению цикла,
            // в этом месте располагается по диагонали новой матрицы, так будет происходить 10 раз
            //но вместо единичек будут записываться 0.1 или 0.9 в
            // зависимости больше значение изначального или меньше
            for (int i = 0; i < onediag.length; i++) {
                for (int j = 0; j < onediag[0].length; j++) {
                    if (i == j) {
                        onediag[i][j] = onematrix[k];
                        k++;
                    }
                }
            }
            double[][] NewMatrix = new double[L][L];

            //произведение по формуле не знаю нужна ли вам формула, кину если нужна,
            // но наша матрица, которую получаем после вычитаний строк, умножается на ее же транспонированную
            for (int i = 0; i < TmatrixD.length; i++) {
                for (int l = 0; l < matrixD[0].length; l++) {
                    for (int j = 0; j < matrixD.length; j++) {
                        NewMatrix[i][l] += TmatrixD[i][j] * matrixD[j][l];
                    }
                }
            }

            //10000 это наше значение лямбды, табличное, нов проге у Саши стояло 1000000, поэтому я вьебал его
            for (int i = 0; i < NewMatrix.length; i++) {
                for (int j = 0; j < NewMatrix[0].length; j++) {
                    NewMatrix[i][j] = NewMatrix[i][j] * 1000000;
                }
            }

            //вот тут наша матрица с которой мы работаем умножается на ту,
            // которая получилась когда единички расположило по диагонали
            for (int i = 0; i < NewMatrix.length; i++) {
                for (int j = 0; j < NewMatrix.length; j++) {
                    NewMatrix[i][j] = NewMatrix[i][j] + onediag[i][j];
                }
            }

            //дальше был использован метод, библиотечный, который решает матрицу Ax=b
            RealVector x = null;
            double[] temp1 = new double[L];
            for (int i = 0; i < L; i++) {
                temp1[i] = b[i] * onematrix[i];
            }
            try {
                RealMatrix a = new Array2DRowRealMatrix(NewMatrix);
                RealVector c = new ArrayRealVector(temp1);
                DecompositionSolver solver = new LUDecomposition(a).getSolver();
                x = solver.solve(c);
            } catch (Exception e) {
                e.printStackTrace();
            }

            result = x.toArray();

            //дальше, в зависимости от значений, которые мы получаем,
            // в массив с единичками, который создавали перед циклом
            // записываются 0.1 или 0.9
            for (int i = 0; i < L; i++) {
                if (b[i] > result[i]) {
                    onematrix[i] = 0.1;
                } else {
                    onematrix[i] = 0.9;
                }
            }

        }
        for (int i = 0; i < L; i++) {
            resultL.add(result[i]);
        }

        return resultL;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void doCard(ActionEvent event) {
        try {
            ArrayList<Double> xCoords = new ArrayList<>();
            ArrayList<Double> yCoords = new ArrayList<>();

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader("C:\\Users\\missi\\IdeaProjects\\new.txt")); //"C:\\Users\\missi\\IdeaProjects\\new.txt"
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


            int character;
            StringBuilder sb = new StringBuilder();
            while ((character = br.read()) != -1) {
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
            int charactery;
            StringBuilder sby = new StringBuilder();
            while ((charactery = br.read()) != -1) {
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
            for (int i = 0; i < yCoords.size() - 1024; i++) {
                xCoords.add(xCoords.get(i));
            }
            int m =0;
            for (int c=0;c<100;c++) {
                XYChart.Series series = new XYChart.Series();
                for (int i = m; i <1024+m; i++) {
                    series.getData().add(new XYChart.Data(xCoords.get(i), yCoords.get(i)));
                }
                m+=1024;
            }


            ArrayList<Double> yMaxCoords = new ArrayList<>();
            double max = yCoords.get(0);
            int h = 0;
            for (int c = 0; c < 100; c++) {
                for (int i = h; i < 1024 + h; i++) {
                    if (yCoords.get(i) > max)
                        max = yCoords.get(i);

                }
                yMaxCoords.add(max);
                max = 0;
                h += 1024;
            }
            double sum = 0;
            for (int i = 0; i < yMaxCoords.size(); i++) {
                sum += yMaxCoords.get(i);
            }
            double min1 = yMaxCoords.get(0);
            double max1 = yMaxCoords.get(0);

            for (Double i: yMaxCoords) {
                if(i < min1)
                    min1 = i;
                if(i > max1)
                    max1 = i;
            }
            double average = sum/yMaxCoords.size();
            double hip=average/8;

            Label[] labels=new Label[]{Label1,Label2,Label3,Label4,Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13,Label14,Label15,Label16,Label17,Label18,Label19,Label20,
                    Label21,Label22,Label23,Label24,Label25,Label26,Label27,Label28,Label29,Label30,Label31,Label32,Label33,Label34,Label35,Label36,Label37,Label38,Label39,Label40,
                    Label41,Label42,Label43,Label44,Label45,Label46,Label47,Label48,Label49,Label50,Label51,Label52,Label53,Label54,Label55,Label56,Label57,Label58,Label59,Label60,
                    Label61,Label62,Label63,Label64,Label65,Label66,Label67,Label68,Label69,Label70,Label71,Label72,Label73,Label74,Label75,Label76,Label77,Label78,Label79,Label80,
                    Label81,Label82,Label83,Label84,Label85,Label86,Label87,Label88,Label89,Label90,
                    Label91,Label92,Label93,Label94,Label95,Label96,Label97,Label98,Label99,Label100,};
            for (int i=0;i<labels.length;i++) {
                labels[i].setText(yMaxCoords.get(i).toString());

            }
            for (int i=0;i<labels.length;i++) {
                Label temp12=labels[i];
                Label finalTemp1 = temp12;
                labels[i].setOnMousePressed(event1 -> pressed(event1, finalTemp1));
            }
            for (int i=0;i<labels.length;i++) {
                if (Double.parseDouble(labels[i].getText())>=min1&&Double.parseDouble(labels[i].getText()) <=( average - hip*4)) {
                labels[i].setStyle("-fx-background-color: #E0FFFF");
            }
                else if (Double.parseDouble(labels[i].getText())>=( average - hip*4)&&Double.parseDouble(labels[i].getText()) <=( average - hip*3)) {
               labels[i].setStyle("-fx-background-color: #AFEEEE");
            }
                else if (Double.parseDouble(labels[i].getText())>=( average - hip*3)&&Double.parseDouble(labels[i].getText()) <=( average - hip*2)) {
                labels[i].setStyle("-fx-background-color: #7FFFD4");
            }
                else if (Double.parseDouble(labels[i].getText())>=( average - hip*2)&&Double.parseDouble(labels[i].getText()) <=( average - hip)) {
                  labels[i].setStyle("-fx-background-color: #40E0D0");
                }
                else if (Double.parseDouble(labels[i].getText())>=( average-hip)&&Double.parseDouble(labels[i].getText()) <=(average)) {
                labels[i].setStyle("-fx-background-color: #E6E6FA");}
                else if (Double.parseDouble(labels[i].getText())<=( average+hip)&&Double.parseDouble(labels[i].getText()) >=( average)) {
                    labels[i].setStyle("-fx-background-color: #00CED1");
                } else if (Double.parseDouble(labels[i].getText())<=( average + hip*2)&&Double.parseDouble(labels[i].getText()) >=( average + hip)) {
                    labels[i].setStyle("-fx-background-color: #058c7e");
                } else if (Double.parseDouble(labels[i].getText())<=( average + hip*3)&&Double.parseDouble(labels[i].getText()) >=( average + hip*2)) {
                    labels[i].setStyle("-fx-background-color: #D8BFD8");
                } else if (Double.parseDouble(labels[i].getText())<=( average + hip*4)&&Double.parseDouble(labels[i].getText()) >=( average + hip*3)) {
                    labels[i].setStyle("-fx-background-color: #4169E1");
                } else if (Double.parseDouble(labels[i].getText())<=max1&&Double.parseDouble(labels[i].getText()) >=( average + hip*4)) {
                labels[i].setStyle("-fx-background-color: #0000FF");}


            }



        }
        catch (NumberFormatException e){
            System.out.println("Введите число");
        }
        catch (Exception e) {
            System.out.println(":3");
        }



    }


    public void doTranslate(MouseEvent event) {
        if(from.getText().equals("     От: ")){
        card.setText("Heat map calculation");
        ENC.setText("    Enter number of chart");
        EN.setText("         Select a range of Х-axis values");
        from.setText(" From");
        before.setText(" Before");}
    }
}









