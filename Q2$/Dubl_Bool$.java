package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Dubl_Q$;
import CC.$.Q2$_LMNt.Q_Bool$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Dubl_Bool$ extends Dubl_Q$,Q_Bool$
{
	Clas_Rap Class=Init_StRt_Nd(Dubl_Bool$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Dubl_Bool$(double A,boolean B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Boolg$(double[] Ag,boolean[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Dubl_Bool$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Boolg$(Iterable<Double> Ag,Iterable<Boolean> Bg)
		{
			Iterator<Double> A_Itr=Ag.iterator();
			Iterator<Boolean> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Dubl_Bool$(A_Itr.next(),B_Itr.next());}
		}
}