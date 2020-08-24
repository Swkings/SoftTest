package Task2;
/**
 * @Author: Swking
 * @email : 1114006175@qq.com
 * @Date : 2020/08/13
 * @File : WorkerControllerTest
 * @Desc :
 **/
import org.junit.Before;
import org.junit.Test;
import org.mockito.stubbing.Answer;
import org.mockito.invocation.InvocationOnMock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class WorkerControllerTest {
    WorkerController workerController;
    WorkerDao workerDao;
    @Before
    public void setUp() throws Exception {
        workerController = new WorkerController();
        workerDao = mock(WorkerDao.class);
        workerController.setWorkerDao(workerDao);
    }

    @Test
    public void getWorkerInfo() {
        Worker worker = new Worker();
        worker.id = 111111;
        worker.name = "mocker";
        worker.dpt = "mock";

        when(workerDao.getWorkerFromDB(anyInt())).thenReturn(worker);

        Worker worker1 = workerController.getWorkerInfo(111111);

        assertEquals(worker1.id, 111111);
        assertEquals(worker1.name, "mocker");
        assertEquals(worker1.dpt, "mock");
    }

    @Test
    public void getWorkerDB() {
        when(workerDao.getWorkerFromDB(anyInt())).thenReturn(null);

        Worker worker1 = workerController.getWorkerInfo(111111);

        assertEquals(worker1.id, 1916059);
        assertEquals(worker1.name, "王康");
        assertEquals(worker1.dpt, "Algorithm");
    }

    @Test
    public void testMock() {
        // 注意: 创建一个mock对象
        WorkerController mockController = mock(WorkerController.class) ;

        doAnswer(new Answer<Void>() {
            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                int workerID = (Integer)invocation.getArguments()[0] ;
                System.out.println("worker id : " + workerID);
                assertEquals(1916059, workerID);
                return null;
            }
        }).when(mockController).getWorkerInfo(anyInt()) ;

        mockController.getWorkerInfo(1916059) ;
    }
}