package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Int_Q$;
import CC.$.Q2$_LMNt.Q_Int$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Int2$ extends
		Int_Q$,
		Q_Int$
{
	Clas_Rap Class=Init_StRt_Nd(Int2$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Int_Int$(int A,int B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Intg$(int[] Ag,int[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Int_Int$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Intg$(Iterable<Integer> Ag,Iterable<Integer> Bg)
		{
			Iterator<Integer> A_Itr=Ag.iterator();
			Iterator<Integer> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Int_Int$(A_Itr.next(),B_Itr.next());}
		}
}