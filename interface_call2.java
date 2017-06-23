
//UI Thread(Main Thread)에서 처리하기 위해서
//mResponseHander.post 를 통해서 메세지 큐에 넣으면
//mResponseHnader가 큐로 부터 받아서 처리한다. (handleMessage라는 메소드에서 수행)

public class Download {

    private Handler mResponseHander;
    private DownloadListner mDownloadListner;

    public interface DownloadListner{
        void onDownloaded(String msg);
    }

    public void setmDownloadlistner(DownloadListner downloadlistner){
        mDownloadListner = downloadlistner;

    }

    //핸들러를 전달받고,  핸들러에 메세지를 전달한다.
    public Download(Handler responseHandler) {
        this.mResponseHander = responseHandler;
        handleRequest();

    }

    private void handleRequest() {

        mResponseHander.post(new Runnable() {
            @Override
            public void run() {
                //상대편 클래스의 메소드 호출
                mDownloadListner.onDownloaded("data download completed...");
            }
        });
    }

}

--------------------------------------------------------

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textview);
        mTextView.setText("this is default value");

        Handler responseHandler = new Handler();
        Download download = new Download(responseHandler); //핸들러 전달

        // 본 클래스에서 인터페이스를 구현(메소드를 구현함)하고
        // 그 주소를 Download클래스에 넘긴다 -> 넘기는 이유는 상대방 클래스에서
        // 여기에 있는 onDownloaded를 호출(callback)하기 위함임.
        download.setmDownloadlistner(new Download.DownloadListner() {
            @Override
            public void onDownloaded(String msg) {
                mTextView.setText(msg);
            }
        });
    }

}


