
package clssync;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author ulacit
 */
public class ClsSync {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            ExecutorService service = Executors.newCachedThreadPool();

            List<ThreadBase> threadList = new ArrayList<>();

            Semillas semillas = new Semillas();
            ThreadBase thread2 = new SingleThreadSemilla(0, semillas);
            threadList.add(thread2);
            
            Usuario usuario = new Usuario();
            ThreadBase thread3 =new SingleThreadUsuario(0, usuario);
            threadList.add(thread3);
            
            for (int i = 0; i < 4; i++) {
                Serpiente serpiente= new Serpiente();
                ThreadBase thread = new SingleThreadSerpiente(i, serpiente);
                threadList.add(thread);
            }

            

//            ComplexSync sync = new ComplexSync();
//            for (int i = 0; i < 10; i++) {
//                ThreadBase thread = new ComplexThread(i, sync);
//                threadList.add(thread);
//            }
            Monitor monitor = new Monitor(threadList);

            for (ThreadBase i : threadList) {
                service.submit(i);
            }

            Future<String> result = service.submit(monitor);
            System.out.println(result.get());
            System.out.println("Se generaron " + Utils.cantidadSemillasGeneradas + " semillas");
            System.out.println("Las serpientes se comieron " + Utils.cantidadSemillasSerpientes + " semillas");
            System.out.println("El usuario se comio " + Utils.cantidadSemillasUsuario + " semillas");
            service.shutdown();
        } catch (InterruptedException ex) {
            
        } catch (ExecutionException ex) {
            
        }

    }

}
