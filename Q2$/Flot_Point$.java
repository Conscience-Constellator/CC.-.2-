package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Flot_Q$;
import CC.$.Q2$_LMNt.Q_Point$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import static java.lang.reflect.Array.newInstance;

public interface Flot_Point$<Out_Typ> extends
		Flot_Q$,
		Q_Point$<Out_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Flot_Point$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Flot_Point$(float A,Out_Typ B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg_Pointg$(float[] Ag,Out_Typ[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Flot_Point$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg_Pointg$(Iterable<Float> Ag,Iterable<Out_Typ> Bg)
		{
			Iterator<Float> A_Itr=Ag.iterator();
			Iterator<Out_Typ> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Flot_Point$(A_Itr.next(),B_Itr.next());}
		}
}