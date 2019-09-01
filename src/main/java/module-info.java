module animu_downloaderu {
	exports com.codingotaku.apps.download;
	exports com.codingotaku.apps.util;
	exports com.codingotaku.apps;
	exports com.codingotaku.apps.callback;
	exports com.codingotaku.apps.custom;
	exports com.codingotaku.apps.source;
	exports com.codingotaku.apps.exception;
	opens com.codingotaku.apps to javafx.fxml;
	
	requires java.desktop;
	requires java.prefs;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires org.jsoup;
}