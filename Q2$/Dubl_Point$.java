package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Dubl_Q$;
import CC.$.Q2$_LMNt.Q_Point$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import static java.lang.reflect.Array.newInstance;

public interface Dubl_Point$<Out_Typ> extends
		Dubl_Q$,
		Q_Point$<Out_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Dubl_Point$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Dubl_Point$(double A,Out_Typ B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Pointg$(double[] Ag,Out_Typ[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Dubl_Point$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Pointg$(Iterable<Double> Ag,Iterable<Out_Typ> Bg)
		{
			Iterator<Double> A_Itr=Ag.iterator();
			Iterator<Out_Typ> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Dubl_Point$(A_Itr.next(),B_Itr.next());}
		}
}