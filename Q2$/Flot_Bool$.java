package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Flot_Q$;
import CC.$.Q2$_LMNt.Q_Bool$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Flot_Bool$ extends
		Flot_Q$,
		Q_Bool$
{
	Clas_Rap Class=Init_StRt_Nd(Flot_Bool$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Flot_Bool$(float A,boolean B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg_Boolg$(float[] Ag,boolean[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Flot_Bool$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg_Boolg$(Iterable<Float> Ag,Iterable<Boolean> Bg)
		{
			Iterator<Float> A_Itr=Ag.iterator();
			Iterator<Boolean> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Flot_Bool$(A_Itr.next(),B_Itr.next());}
		}
}