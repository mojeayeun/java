public class Download {

    private Handler mResponseHander;
    private DownloadListner mDownloadListner;

    //인터페이스 정의
    public interface DownloadListner{
        void onDownloaded(String msg);
    }

    //생성자에서 연결할 인터페이스 
    public Download(DownloadListner x) {
        mDownloadListner = x;
        a(); //인터페이스의 멤버함수 호출
    }

    private void a(){
        mDownloadListner.onDownloaded("test");
    }
}
----------------------------------------------------

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textview);
        mTextView.setText("default value");


        //인터페이스 생성- 생성시점에 인터페이스의 함수를 구현해야 함
        // 참고: class A extends B implementation C{
        // } 라고 하면 A를래스가 생성될때 B가 자동으로 생성되며
        // interface C는 구현(메소드 구현) 되어야 컴피알이 됨.
        Download.DownloadListner x = new Download.DownloadListner() {
            @Override
            public void onDownloaded(String msg) {
                Log.d("MainActivity","call from Download.java : "+msg);
                mTextView.setText(msg);
            }
        };


        Download download = new Download(x); //자신

    }
}
----------------------------


