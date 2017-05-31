package id.co.imastudio.sinaulayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    //step 1 dikenalin, deklarasi variabel tipe button
    Button linear,relative,frame,constraint,tabel,scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //step 2 sambungin inisialisasi variabel dengan button-> R artinya resource  R.id artinya cari resource dg id
        linear=(Button) findViewById(R.id.btnLinear);
        relative=(Button) findViewById(R.id.btnRelative);
        frame=(Button) findViewById(R.id.btnFrame);
        constraint=(Button) findViewById(R.id.btnConstraint);
        tabel=(Button) findViewById(R.id.btnTable);
        scroll=(Button) findViewById(R.id.btnScrollView);

        //step 3 ngapain -> ketik nama variabel trus titik, pilih setOnCLickListener trus Enter
                            // muncul kurung buka, ketik new V pilih setOnClickListener trus Enter

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "ini toast", Toast.LENGTH_SHORT).show();
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(MenuActivity.this);
                alertdialog.setTitle("Judul Alert Dialog");
                alertdialog.setMessage("Message");
                alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MenuActivity.this, "ini toast 2", Toast.LENGTH_SHORT).show();

                        Intent pindah = new Intent(MenuActivity.this,RelativeActivity.class);
                        startActivity(pindah);
                    }
                });
                alertdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertdialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                alertdialog.setIcon(R.drawable.arrowdown);
                alertdialog.show();

                //alertdialog.setTitle("Judul Alert Dialog").setMessage("Message").show();
            }
        });

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Tes Snackbar",Snackbar.LENGTH_LONG).show();

            }
        });

        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah= new Intent(MenuActivity.this,ConstraintActivity.class);
                startActivity(pindah);
            }
        });

        tabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this,TableActivity.class);
                startActivity(pindah);
            }
        });

        scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(MenuActivity.this,ScrollViewActivity.class);
                startActivity(pindah);
            }
        });
    }
}
