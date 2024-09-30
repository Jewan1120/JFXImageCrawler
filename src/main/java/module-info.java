module com.crawler.daenggu.daenggu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.crawler.daenggu.daenggu to javafx.fxml;
    exports com.crawler.daenggu.daenggu;
}