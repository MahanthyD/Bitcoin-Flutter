package co.appbrewery.bitcoin_ticker;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  System.out.println("1st Random Number: " + Math.random());   
System.out.println("2nd Random Number: " + Math.random());  
System.out.println("3rd Random Number: " + Math.random());   
System.out.println("4th Random Number: " + Math.random());   
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
  }
}
/*%nothing%/*
