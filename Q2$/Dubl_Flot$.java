package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Dubl_Q$;
import CC.$.Q2$_LMNt.Q_Flot$;

import java.util.Iterator;

public interface Dubl_Flot$ extends Dubl_Q$,Q_Flot$
{
	Clas_Rap Class=Init_StRt_Nd(Dubl_Flot$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Dubl_Flot$(double A,float B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Flotg$(double[] Ag,float[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Dubl_Flot$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Flotg$(Iterable<Double> Ag,Iterable<Float> Bg)
		{
			Iterator<Double> A_Itr=Ag.iterator();
			Iterator<Float> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Dubl_Flot$(A_Itr.next(),B_Itr.next());}
		}
}