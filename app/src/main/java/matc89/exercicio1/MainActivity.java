package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewHolder.editNome = (EditText) findViewById(R.id.editNome);
        this.mViewHolder.labelMensagem = (TextView) findViewById(R.id.labelMensagem);
        this.mViewHolder.btnCumprimentar = (Button) findViewById(R.id.btnCumprimentar);

        this.mViewHolder.btnCumprimentar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnCumprimentar){
            String value = this.mViewHolder.editNome.getText().toString();
            if(value.equals("")){
                Toast.makeText(this,"Informe um nome!",Toast.LENGTH_LONG).show();
            }else{
                String nome = this.mViewHolder.editNome.getText().toString();
                this.mViewHolder.labelMensagem.setText(String.format("Alô, " + nome + "!"));
            }
        }

    }

    private static class ViewHolder{
        EditText editNome;
        TextView labelMensagem;
        Button btnCumprimentar;
    }
}
