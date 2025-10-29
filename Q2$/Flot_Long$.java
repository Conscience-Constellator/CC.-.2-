package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Flot_Q$;
import CC.$.Q2$_LMNt.Q_Long$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Flot_Long$ extends
		Flot_Q$,
		Q_Long$
{
	Clas_Rap Class=Init_StRt_Nd(Flot_Long$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Flot_Long$(float A,long B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void In_Flotg_Longg(float[] Ag,long[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Flot_Long$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void In_Flotg_Longg(Iterable<Float> Ag,Iterable<Long> Bg)
		{
			Iterator<Float> A_Itr=Ag.iterator();
			Iterator<Long> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Flot_Long$(A_Itr.next(),B_Itr.next());}
		}
	}