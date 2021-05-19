package rafael.guimaraes.projeto02;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


public class CadastrarAnuncio extends AppCompatActivity {
    //permisões camera
    private String[] permissoesNecessarias = new String[]{
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA
    };

    private ImageButton imageButtonCamera, imageButtonGaleria;
    private static final int SELECAO_CAMERA = 100;
    private static final int SELECAO_GALERIA = 200;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_anuncio);

        //Permissao.validarPermissoes(permissoesNecessarias, activity:this, requestCode:1);

     imageButtonCamera = findViewById(R.id.imageButtonCamera);
     imageButtonGaleria = findViewById(R.id.imageButtonGaleria);

     imageButtonCamera.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
             if( i.resolveActivity(getPackageManager())!=null){
                 startActivityForResult(i, SELECAO_CAMERA);
             }

         }
     });
    }

}