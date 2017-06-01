
import org.junit.Test;
import com.ljn.demo.Book;
import com.ljn.demo.DoubanApiUtil;

import java.io.IOException;

/**
 * Created by liuji on 2017/6/1.
 */
public class DoubanTest {
    @Test
    public void getBookInfoByIsbn(){
        String isbn10 = "730808325X";
        try {
            Book book = DoubanApiUtil.getBookByIsbn(isbn10);
            System.out.println(book.toString());
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void getBookInfoById(){
        String id= "7056972";
        try {
            Book book = DoubanApiUtil.getBookById(id);
            System.out.println(book.toString());
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
