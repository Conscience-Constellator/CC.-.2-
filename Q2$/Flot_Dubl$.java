package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Flot_Q$;
import CC.$.Q2$_LMNt.Q_Dubl$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Flot_Dubl$ extends
		Flot_Q$,
		Q_Dubl$
{
	Clas_Rap Class=Init_StRt_Nd(Flot_Dubl$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Flot_Dubl$(float A,double B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg_Dublg$(float[] Ag,double[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Flot_Dubl$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg_Dublg$(Iterable<Float> Ag,Iterable<Double> Bg)
		{
			Iterator<Float> A_Itr=Ag.iterator();
			Iterator<Double> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Flot_Dubl$(A_Itr.next(),B_Itr.next());}
		}
}