package mongkhonsin.atsadawut.smartvote;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PermissionsActivity extends AppCompatActivity {
    private Button permissionsButton;
    private EditText editTextId;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions);

        permissionsButton = findViewById(R.id.permissions_button);
        permissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextId = findViewById(R.id.edit_text_id);
                id = editTextId.getText().toString();
                AlertDialog.Builder dialog = new AlertDialog.Builder(PermissionsActivity.this);
                dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                boolean idNumEqual13 = (id.length() == 13);
                boolean idEqual_1 = (id.equals("1111111111111"));
                boolean idEqual_2 = (id.equals("2222222222222"));
                if(!idNumEqual13){
                    Toast toast = Toast.makeText(PermissionsActivity.this, "กรุณากรองเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_LONG);
                    toast.show();
                }
                else if(idNumEqual13 && idEqual_1 || idEqual_2){
                    dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    dialog.setNegativeButton("OK", null);
                    dialog.show();
                }
                else if(idNumEqual13 && !idEqual_1 || !idEqual_2){
                    dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    dialog.setNegativeButton("OK", null);
                    dialog.show();
                }
            }
        });
    }
}