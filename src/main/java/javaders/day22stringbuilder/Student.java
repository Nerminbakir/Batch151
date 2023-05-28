package javaders.day22stringbuilder;

public class Student {

        public String stdName="Ali Can";

    /*Access Modifier'ı default olan class memberlar aynı package içinde
    kullanıldıklarında aynı özellikleri gösterirler.
    Fakat farklı package'a geçtiğinizde public olanlara ulaşılabilir,
    default olanlara ulaşılamaz.

     */
        int age=23;

    /*
    Access Modifier'ı private olan Class'lar sadece içinde bulundukları Class'ta görünürler.
    Oluşturuldukları Class'ın dışına çıktıklarında görünmez, ulaşılmaz olurlar.
    */
        private String healtCondition ="Cancer";


    /*
    Access Modifier'ı protected olan Class Member'lar aynı packed içinde iken public gibi davranırlar.
     Farklı package'ye geçtiğinizde protected olanlar sadece child class'lardan görülebilir

     */
        protected int salary= 5000;

        //Note: Class'lar public ve default olabilir. Ama, private ve protected olamazlar.

        //NOTE :Class'a private yazamayiz Java hata verir. Cunku Class'lar kaliptir. Kalip private olursa ona kimse ulasamaz


}
