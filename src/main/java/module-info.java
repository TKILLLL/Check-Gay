module me.phantam.org.checkgay {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.phantam.org.checkgay to javafx.fxml;
    exports me.phantam.org.checkgay;
}