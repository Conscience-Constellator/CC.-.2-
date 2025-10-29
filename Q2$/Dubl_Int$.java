package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Dubl_Q$;
import CC.$.Q2$_LMNt.Q_Int$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Dubl_Int$ extends Dubl_Q$,Q_Int$
{
	Clas_Rap Class=Init_StRt_Nd(Dubl_Int$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Dubl_Int$(double A,int B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Intg$(double[] Ag,int[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Dubl_Int$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Intg$(Iterable<Double> Ag,Iterable<Integer> Bg)
		{
			Iterator<Double> A_Itr=Ag.iterator();
			Iterator<Integer> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Dubl_Int$(A_Itr.next(),B_Itr.next());}
		}
}