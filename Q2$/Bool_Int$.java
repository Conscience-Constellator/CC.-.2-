package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Bool_Q$;
import CC.$.Q2$_LMNt.Q_Int$;

import java.util.Iterator;

public interface Bool_Int$ extends Bool_Q$,Q_Int$
{
	Clas_Rap Class=Init_StRt_Nd(Bool_Int$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Bool_Int$(boolean A,int B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Intg$(boolean[] Ag,int[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Bool_Int$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Intg$(Iterable<Boolean> Ag,Iterable<Integer> Bg)
		{
			Iterator<Boolean> A_Itr=Ag.iterator();
			Iterator<Integer> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Bool_Int$(A_Itr.next(),B_Itr.next());}
		}
}