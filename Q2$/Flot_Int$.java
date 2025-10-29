package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Flot_Q$;
import CC.$.Q2$_LMNt.Q_Int$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Flot_Int$ extends
		Flot_Q$,
		Q_Int$
{
	Clas_Rap Class=Init_StRt_Nd(Flot_Int$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Flot_Int$(float A,int B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void In_Flotg_Intg(float[] Ag,int[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Flot_Int$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void In_Flotg_Intg(Iterable<Float> Ag,Iterable<Integer> Bg)
		{
			Iterator<Float> A_Itr=Ag.iterator();
			Iterator<Integer> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Flot_Int$(A_Itr.next(),B_Itr.next());}
		}
}