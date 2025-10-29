package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Flot_Q$;
import CC.$.Q2$_LMNt.Q_Short$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Flot_Short$ extends
		Flot_Q$,
		Q_Short$
{
	Clas_Rap Class=Init_StRt_Nd(Flot_Short$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Flot_Short$(float A,short B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg_Shortg$(float[] Ag,short[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Flot_Short$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg_Shortg$(Iterable<Float> Ag,Iterable<Short> Bg)
		{
			Iterator<Float> A_Itr=Ag.iterator();
			Iterator<Short> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Flot_Short$(A_Itr.next(),B_Itr.next());}
		}
}