package chat.hemant.com.qrcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.barcode.BarcodeDetector;

public class ScanActivity extends AppCompatActivity {

    SurfaceView camera_view;
    BarcodeDetector barcodeDetector;
    CameraSource cameraSource;
    SurfaceHolder surfaceHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        camera_view = findViewById(R.id.camera_view);
        camera_view.setZOrderMediaOverlay(true);
        surfaceHolder = camera_view.getHolder();
        barcodeDetector = new BarcodeDetector().Builder(this)
                
    }
}
