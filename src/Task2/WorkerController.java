package Task2;
/**
 * @Author: Swking
 * @email : 1114006175@qq.com
 * @Date : 2020/08/13
 * @File : WorkerController
 * @Desc :
 **/
public class WorkerController {
    private WorkerDao workerDao;

    public Worker getWorkerInfo(int id) {
        Worker worker = null;
        if (workerDao != null) {
            worker = workerDao.getWorkerFromDB(id);
        }
        if (worker == null) {
            worker = fetchWorkerInfo(id);
        }
        return worker;
    }

    private Worker fetchWorkerInfo(int id) {
        System.out.println("Info from server");
        Worker worker = new Worker();
        worker.id = 1916059;
        worker.name = "王康";
        worker.dpt = "Algorithm";
        return worker;
    }

    public void setWorkerDao(WorkerDao dao) {
        this.workerDao = dao;
    }
}
