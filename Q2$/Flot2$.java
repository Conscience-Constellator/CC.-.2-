package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Flot_Q$;
import CC.$.Q2$_LMNt.Q_Flot$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Flot2$ extends
		Flot_Q$,
		Q_Flot$
{
	Clas_Rap Class=Init_StRt_Nd(Flot2$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Flot_Flot$(float A,float B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void In_Flotg_Flotg(float[] Ag,float[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Flot_Flot$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void In_Flotg_Flotg(Iterable<Float> Ag,Iterable<Float> Bg)
		{
			Iterator<Float> A_Itr=Ag.iterator();
			Iterator<Float> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Flot_Flot$(A_Itr.next(),B_Itr.next());}
		}
}