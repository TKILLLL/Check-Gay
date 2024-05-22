package me.phantam.org.checkgay;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

import java.util.Optional;
import java.util.Random;

public class AlertController {

    private int phanTram;

    private int getPhanTram() {
        return phanTram;
    }

    private void setPhanTram(int phanTram) {
        this.phanTram = phanTram;
    }

    public void randomDuLieu() {
        Random random = new Random();
        this.phanTram = random.nextInt(101);
    }

    private String kiemTra() {
        if (this.phanTram >= 0 && this.phanTram <= 25) {
            return getPhanTram() + "% Gay   -->  Không gay";
        } else if (this.phanTram >= 26 && this.phanTram <= 50) {
            return getPhanTram() + "% Gay   -->  Gần gay";
        } else if (this.phanTram >= 51 && this.phanTram <= 75) {
            return getPhanTram() + "% Gay   -->  Hơi hơi gay";
        } else {
            return getPhanTram() + "% Gay   -->  Địt mẹ gay";
        }
    }

    @FXML
    private CheckBox checkBox;

    @FXML
    protected void onButtonClick() {
        if (checkBox.isSelected()) {
            Alert xacNhan = new Alert(AlertType.CONFIRMATION);
            xacNhan.setTitle("Xác nhận");
            xacNhan.setHeaderText(null);
            xacNhan.setContentText("Bạn có chắc chắn muốn kiểm tra % gay không?");
            ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
            ButtonType no = new ButtonType("No", ButtonBar.ButtonData.NO);
            xacNhan.getButtonTypes().setAll(yes, no);
            Optional<ButtonType> res = xacNhan.showAndWait();

            if (res.isPresent() && res.get().getButtonData() == ButtonBar.ButtonData.YES) {
                randomDuLieu();
                Alert ketQua = new Alert(AlertType.INFORMATION);
                ketQua.setTitle("Kết quả");
                ketQua.setHeaderText(null);
                ketQua.setContentText(kiemTra());
                ketQua.showAndWait();
            }
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Cảnh báo");
            alert.setHeaderText(null);
            alert.setContentText("Bạn phải chấp nhận 'Bạn có chắc chắn muốn kiểm tra % gay không?'");
            alert.showAndWait();
        }
    }
}
