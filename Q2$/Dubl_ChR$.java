package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Dubl_Q$;
import CC.$.Q2$_LMNt.Q_ChR$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Dubl_ChR$ extends Dubl_Q$,Q_ChR$
{
	Clas_Rap Class=Init_StRt_Nd(Dubl_ChR$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Dubl_ChR$(double A,char B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_ChRg$(double[] Ag,char[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Dubl_ChR$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_ChRg$(Iterable<Double> Ag,Iterable<Character> Bg)
		{
			Iterator<Double> A_Itr=Ag.iterator();
			Iterator<Character> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Dubl_ChR$(A_Itr.next(),B_Itr.next());}
		}
}